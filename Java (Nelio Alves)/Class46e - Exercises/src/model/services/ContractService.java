package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        Double valuePerIntallment = contract.getTotalValue()/months;

        for(int i=1; i<=months; i++){
            LocalDate date = contract.getDate().plusMonths(i);
            Double interest  = onlinePaymentService.interest(valuePerIntallment, i);
            Double fee = onlinePaymentService.paymentFee(valuePerIntallment + interest);
            Double total = valuePerIntallment + interest + fee;
            contract.getInstallments().add(new Installment(date, total));
        }
    }
}
