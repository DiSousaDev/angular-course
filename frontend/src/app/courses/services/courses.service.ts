import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { first } from 'rxjs';
import { delay, tap } from 'rxjs/operators';

import { Course } from '../model/course';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  private readonly API = 'api/courses';

  constructor(private httpClient: HttpClient) { }

  list() {
    return this.httpClient.get<Course[]>(this.API)
    .pipe(
      first(),
      delay(500),
      tap(courses => console.log(courses))
    );
  }

  save(record: Partial<Course>) {
    return this.httpClient.post<Course>(this.API, record)
    .pipe(
      first()
    );
  }

}
