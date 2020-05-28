import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { PostJobService } from '../post-job.service';
import { User1 } from '../user1';
import { Router } from '@angular/router';

@Component({
  selector: 'app-job-post',
  templateUrl: './job-post.component.html',
  styleUrls: ['./job-post.component.css']
})
export class JobPostComponent implements OnInit 
{

  constructor(private router:Router, private service:PostJobService) { }
  user1:User1 = new User1("","","","","","","","","","","","","","","","");
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
    let response=this.service.doRegistration1(form.value);
    response.subscribe((data)=> this.message = data);
  }

  ngOnInit() {
  }


}
