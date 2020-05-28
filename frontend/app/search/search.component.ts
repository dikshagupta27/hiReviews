import { Component, OnInit } from '@angular/core';
import { SearchJobService } from '../search-job.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  message:any;
  searchbar:String;
  data:any;
  jobs:any;
  totalRecords:any;
  s1:any;
  k1:any;
  constructor(private service1:SearchJobService) { }
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
  ngOnInit() 
  {

  }

}
