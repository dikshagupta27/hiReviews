import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { UserLoginService } from '../user-login.service';
import { User } from '../user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit 
{
  constructor(private router:Router, private service:UserLoginService) { }
  user:User = new User("","","","","","");
  message:any;
  selectedFile=null;
  hide=true;
  
  OnFileSelected(event)
  {
    this.selectedFile=event.target.files[0]
  }
  
  registerProcess(form)
  {
    console.log(form.value);
    let response=this.service.doRegistration(form.value);
    response.subscribe((data)=> this.message = data);
  }

  ngOnInit() {
  }

}
