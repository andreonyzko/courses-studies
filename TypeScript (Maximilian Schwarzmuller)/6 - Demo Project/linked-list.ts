class ListNode<T>{
    public next?: ListNode<T>;
    constructor(public value: T){};
}

class LinkedList<T>{
    private root?: ListNode<T>;
    private tail?: ListNode<T>;
    private length = 0;

    add(value: T){
        const node = new ListNode<T>(value)
        
        if(!this.root || !this.tail){
            this.root = this.tail = node;
        }

        else {
            this.tail.next = this.tail = node;
            
            this.length++;
        }
    }

    print(){
        let message: string = '';

        if(!this.root){
            message = 'Empty list';
        }

        else {
            let currentNode: ListNode<T> | undefined = this.root;

            while(currentNode){
                message += `${currentNode.value} -> `;
                currentNode = currentNode.next;
            }
        }

        console.log(message);
    }
}

const numberList = new LinkedList<number>;
numberList.add(-1);
numberList.add(2);
numberList.add(-3);
numberList.add(4);
numberList.add(-5);
numberList.print();