"use strict";
function calculateInvesment(data) {
    let { initialValue, contribuation, percentange, duration } = data;
    let currentYear = new Date().getFullYear();
    const results = [];
    let total = initialValue;
    let totalInvested = initialValue;
    let totalEarned = 0;
    for (let i = 1; i <= duration; i++) {
        let year = currentYear + i;
        total *= (1 + percentange);
        totalEarned = total - totalInvested;
        totalInvested += contribuation;
        total += contribuation;
        results.push({
            year: year,
            total: total,
            totalInvested: totalInvested,
            totalEarned: totalEarned
        });
    }
    return results;
}
function printResults(results) {
    for (let year of results) {
        console.log(`YEAR ${year.year}`);
        console.log(`Total: ${year.total.toFixed(2)}`);
        console.log(`Total Invested: ${year.totalInvested.toFixed(2)}`);
        console.log(`Total Earned: ${year.totalEarned.toFixed(2)}`);
        console.log(`\n-----------------------------\n`);
    }
}
const investiment = {
    initialValue: 5000,
    contribuation: 500,
    percentange: 0.08,
    duration: 10
};
const results = calculateInvesment(investiment);
printResults(results);
