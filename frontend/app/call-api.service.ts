import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class CallApiService 
{

  constructor(private http:HttpClient) 
  {

  }
  getData()
  {
    return this.http.get('http://localhost:8080/getJobs');
   
  }
  
}
