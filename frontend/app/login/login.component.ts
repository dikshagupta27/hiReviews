import { Component, OnInit } from '@angular/core';
import { UserLoginService } from './../user-login.service';
import { User } from './../user';
import { Router } from '@angular/router';
import { AuthService } from 'angularx-social-login';
import { SocialUser } from 'angularx-social-login';
import { GoogleLoginProvider, FacebookLoginProvider } from 'angularx-social-login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit
 
{
      // user: User = new User("","","");
    // message: any;
    credentials:any;
    user: SocialUser;
  
    constructor(private router:Router, private service:UserLoginService,private authService: AuthService)
    {
        let response=this.service.gettingCredentials();
        response.subscribe((data)=>this.credentials=data);
    }
    LoginProcess(form)
    {
      let response=this.service.gettingCredentials();
      response.subscribe((data)=> this.credentials = data);
      console.log("login done");
    
    }
    onLogin(form)
    {
      let flag:boolean=true;
      let email:String=form.value.email;
      let password:String= form.value.password;

      for(let i in this.credentials)
      { 
        if(email == this.credentials[i].email && password == this.credentials[i].password && form.valid == true )
        {
          flag=false;
          break;
          // this.router.navigateByUrl('/home');

        }
        else
        {
        }
      }

      if(flag==true)
      {
        alert("Invalid Credentials!");
      }
    }


  ngOnInit()
   {
    this.authService.authState.subscribe((user) => 
    {
      this.user = user;
      console.log(user);
    });
  }

  signInWithGoogle(): void {
    this.authService.signIn(GoogleLoginProvider.PROVIDER_ID).then(x => console.log(x));
  }

  signInWithFB(): void {
    this.authService.signIn(FacebookLoginProvider.PROVIDER_ID).then(x => console.log(x));
  }

  
  signOut(): void {
    this.authService.signOut();
  }

  
  // public LoginProcess() {
  //   let response = this.service.doLogin(this.user);
  //   response.subscribe((data) => this.message = data);
}
