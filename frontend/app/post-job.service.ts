import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User1 } from './user1';


@Injectable({
  providedIn: 'root'
})
export class PostJobService 
{
  constructor(private http:HttpClient) { }

  public doRegistration1(user1:User1){
      
    return this.http.post("http://localhost:8080/createJobs",user1,{responseType:'text' as 'json'});
  }
  public gettingCredentials()
  {
    return this.http.get("http://localhost:8080/getJobs");
  }

  //Does a API Call using POST Http Method
  // public doLogin(user: User) {
  //   return this.http.post("http://localhost:8080/create", user, {responseType: 'text' as 'json'});
  // }

 
}
