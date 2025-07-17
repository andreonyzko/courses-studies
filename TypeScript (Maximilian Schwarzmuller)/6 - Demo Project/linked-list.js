"use strict";
class ListNode {
    value;
    next;
    constructor(value) {
        this.value = value;
    }
    ;
}
class LinkedList {
    root;
    tail;
    length = 0;
    add(value) {
        const node = new ListNode(value);
        if (!this.root || !this.tail) {
            this.root = this.tail = node;
        }
        else {
            this.tail.next = this.tail = node;
            this.length++;
        }
    }
    print() {
        let message = '';
        if (!this.root) {
            message = 'Empty list';
        }
        else {
            let currentNode = this.root;
            while (currentNode) {
                message += `${currentNode.value} -> `;
                currentNode = currentNode.next;
            }
        }
        console.log(message);
    }
}
const numberList = new LinkedList;
numberList.add(-1);
numberList.add(2);
numberList.add(-3);
numberList.add(4);
numberList.add(-5);
numberList.print();
