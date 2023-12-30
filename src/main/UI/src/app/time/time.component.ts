import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-time',
  templateUrl: './time.component.html',
  styleUrls: ['./time.component.css'],
})
export class TimeComponent implements OnInit {
  DisplayTime$!: Observable<string>;

  private baseURL = 'http://localhost:8080';

  constructor(private httpClient: HttpClient) {}

  ngOnInit(): void {
    //Display Times
    this.DisplayTime$ = this.httpClient.get(`${this.baseURL}/api/time/zones`, {
      responseType: 'text',
    });
  }
}
