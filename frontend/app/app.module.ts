import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {MatInputModule,MatDialogModule,MatIconModule, MatButtonModule,
  MatCheckboxModule,MatFormFieldModule,MatRippleModule,MatDatepickerModule,
  MatCardModule,MatToolbarModule,MatExpansionModule} from '@angular/material';
  import { MatTabsModule } from '@angular/material';
  import {MatTableDataSource} from '@angular/material';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import{HttpClientModule} from '@angular/common/http';
import { HomepageComponent } from './homepage/homepage.component';

import { RegistrationComponent } from './registration/registration.component';

import { LoginComponent } from './login/login.component';


import { SocialLoginModule } from 'angularx-social-login';
import { AuthServiceConfig, GoogleLoginProvider, FacebookLoginProvider  } from 'angularx-social-login';

import { JobPostComponent } from './job-post/job-post.component';
import { ApiCallComponent } from './api-call/api-call.component';
import { SearchComponent } from './search/search.component';
import { AboutUSComponent } from './about-us/about-us.component';
import { ApplyJobComponent } from './apply-job/apply-job.component';
import { ExampleComponent } from './example/example.component';



const config = new AuthServiceConfig([
  {
    id: GoogleLoginProvider.PROVIDER_ID,
    provider: new GoogleLoginProvider('372329254142-ch0jsaj9nuhev05cn3q87bthq32gemcb.apps.googleusercontent.com')
  },
  {
     id: FacebookLoginProvider.PROVIDER_ID,
     provider: new FacebookLoginProvider('864078104052651')
  },
  
]);

export function provideConfig() {
  return config;
}


@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    RegistrationComponent,
    LoginComponent,
 
    JobPostComponent,
    ApiCallComponent,
    SearchComponent,
    AboutUSComponent,
    ApplyJobComponent,
    ExampleComponent,

    ],
 

  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule,
    BrowserAnimationsModule,MatDialogModule,
    MatInputModule,MatIconModule, MatButtonModule,
  MatCheckboxModule,MatFormFieldModule,MatRippleModule,MatDatepickerModule,
  MatCardModule,MatToolbarModule,MatExpansionModule,
  SocialLoginModule,MatTabsModule

  ],
  providers:
   [
    {
      provide: AuthServiceConfig,
      useFactory: provideConfig
    }
   ],
  bootstrap: [AppComponent]
  
})
export class AppModule { }
