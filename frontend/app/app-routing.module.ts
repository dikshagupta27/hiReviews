import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutUSComponent } from './about-us/about-us.component';
import { ApplyJobComponent } from './apply-job/apply-job.component';
import { HomepageComponent } from './homepage/homepage.component';
import { JobPostComponent } from './job-post/job-post.component';

import { RegistrationComponent } from './registration/registration.component';

import { LoginComponent } from './login/login.component';
import { SearchComponent } from './search/search.component';



const routes: Routes = [
  {path:'homepage',component:HomepageComponent},
    {path:'registration',component:RegistrationComponent},
    {path:'loginn',component:LoginComponent},
    {path:'job-post',component:JobPostComponent},
    {path:'about-us',component:AboutUSComponent},
    {path:'applyJob',component:ApplyJobComponent},
    {path:'search',component: SearchComponent},

        {path:'',redirectTo: '/homepage',pathMatch:'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
