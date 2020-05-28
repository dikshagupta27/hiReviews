import { Injectable } from '@angular/core';
// import { Post } from '../post';
import { Post } from './Post';

import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService 
{

  searchOption=[]
    public postsData: Post[] 
    postUrl : string = "https://localhost:8080/getJobs";

  constructor(private http: HttpClient) { }

  getPosts(): Observable<Post[]>{
        return this.http.get<Post[]>(this.postUrl);
  }

  filteredListOptions() {
    let posts = this.postsData;
        let filteredPostsList = [];
        for (let post of posts) {
            for (let options of this.searchOption) {
                if (options.jobLocation === post.jobLocation) {
                  filteredPostsList.push(post);
                }
            }
        }
        console.log(filteredPostsList);
        return filteredPostsList;
  }

}
