import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { customer } from '../datamodels/Customer';
import { CustomerService } from '../Services/customer.service';
@Component({
  selector: 'app-edit-customerdetails',
  templateUrl: './edit-customerdetails.component.html',
  styleUrls: ['./edit-customerdetails.component.css']
})
export class EditCustomerdetailsComponent implements OnInit {

  
  isDisabled=true;
  customer:customer;
  accounts:any;
  userId;
  infoMessage;
  //accountInfo;
  constructor(private paramsRoute: ActivatedRoute,private customerService:CustomerService,private route:Router) { 
      this.userId=this.paramsRoute.snapshot.params.id;
  }

  editOrSave(form){
    if(this.isDisabled===false)
      this.updateCustomer(form.value);
    this.isDisabled=!this.isDisabled;
  }

  updateCustomer(data){
    data['cust_id']=this.userId;
    this.customerService.updateCustomer(data).subscribe(res=> console.log("success"));
    this.infoMessage="Details Updated Succesfully"
  }
  ngOnInit() {
    this.customerService.findById(this.userId).subscribe(res=>
      {this.customer=res});

    
    
  }

  deactivate(data){
    console.log(data)
    if(data['activated']===true){
      console.log("hi")
      data['activated']=false
  }
  else if(data['activated']===false){
    console.log("bye")
      data['activated']=true
  }
    console.log(data);
    this.customerService.updateCustomer(data).subscribe(res => console.log(res));
  }

  addAccount(){
    this.route.navigateByUrl('/admin/edit/editCustomer/'+this.userId+'/addAccount');
  }
  
  showHistory(account){
    this.route.navigateByUrl('/admin/edit/editCustomer/'+this.userId+'/history/'+account);
  }


}
