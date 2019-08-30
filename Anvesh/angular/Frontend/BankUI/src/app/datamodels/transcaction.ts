import { Account } from './account';

export class Transaction{
    constructor(private tid:number,private amount:number,private time,private fromAccount:Account,
        private toAccount:Account){}

    get id(){
        return this.tid;
    }
}