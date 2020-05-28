import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { HttpClientModule }    from '@angular/common/http';
import {MatTableDataSource} from '@angular/material';
import { CallApiService } from '../call-api.service';
import { MatTabsModule } from '@angular/material';
import {MatExpansionModule} from '@angular/material';
import { SearchJobService } from '../search-job.service';

@Component({
  selector: 'app-apply-job',
  templateUrl: './apply-job.component.html',
  styleUrls: ['./apply-job.component.css']
})


export class ApplyJobComponent implements OnInit 
{
  task: string;
  tasks = [];
  task1: string;
  tasks1 = [];
  onClick(){
    this.tasks.push({name: this.task});
    this.task = '';
  }
 
  onClick1(){
    this.tasks1.push({name: this.task1});
    this.task1 = '';
  }
  information1:any;

  constructor(private companyData:CallApiService,private service1:SearchJobService) { }

  message:any;
  searchbar:String;
  data:any;
  jobs:any;
  totalRecords:any;
  s1:any;
  k1:any;
  
  searchProcess(form)
  {
    let response=this.service1.search(form);
    response.subscribe((data)=> this.jobs = data);
    // console.log("login done");
  
  }
  search(s:String)
  {
    console.log("hello " + "done " );
    email:String;
    this.service1.search(s).subscribe((data:String)=>
    {
      let totalRecords = Object.keys(data);
      for (let i = 0 ;i< totalRecords.length; i++)
      {
        let s1 =  Object.values(data[i]) as String [];
        let k1 =  Object.keys(data[i]) as String [];
        for (let j = 0 ;j< k1.length; j++)
        console.log(" "+ k1[j] + "-" + s1[j]);
      }
      this.jobs=data;
      
           
    }); 
    
    
  }
  

  ngOnInit() {
    this.information1=this.companyData.getData();
  }

}
