import { User } from './user';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class UserLoginService 
{

  constructor(private http:HttpClient) { }

  public doRegistration(user:User){
      
    return this.http.post("http://localhost:8080/create1",user,{responseType:'text' as 'json'});
  }
  public gettingCredentials()
  {
    return this.http.get("http://localhost:8080/getAll");
  }

  //Does a API Call using POST Http Method
  // public doLogin(user: User) {
  //   return this.http.post("http://localhost:8080/create", user, {responseType: 'text' as 'json'});
  // }
}
