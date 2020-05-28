import { Component, OnInit } from '@angular/core';
 import {HttpClient} from '@angular/common/http';
import { HttpClientModule }    from '@angular/common/http';

import { CallApiService } from '../call-api.service';


@Component({
  selector: 'app-api-call',
  templateUrl: './api-call.component.html',
  styleUrls: ['./api-call.component.css']
})

export class ApiCallComponent implements OnInit 
{
  
  information:any;
  
  constructor(private companyData:CallApiService)
  {

  }
  
  
  ngOnInit() 
  {
    this.information=this.companyData.getData();
  }

}

