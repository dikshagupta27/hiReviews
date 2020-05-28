import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SearchJobService {

  constructor(private hhttp:HttpClient) { }
  search(jobLocation)
  {
    
     console.log("http://localhost:8080/get2/"+jobLocation, {responseType:'text' as 'json'});
    return this.hhttp.get("http://localhost:8080/get2/"+jobLocation);

  }
  
}
