import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { Course } from '../model/course';
import { CoursesService } from './../services/courses.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.scss']
})
export class CoursesComponent implements OnInit {

  courses$: Observable<Course[]>;
  displayedColumns = ['name','category'];

  //cousesService: CoursesService;

  constructor(private cousesService: CoursesService) {
    // this.cousesService = new CoursesService();
    this.courses$ = this.cousesService.list();
  }

  ngOnInit(): void { }

}
