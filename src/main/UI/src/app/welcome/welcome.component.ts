import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css'],
  changeDetection: ChangeDetectionStrategy.Default,
})
export class WelcomeComponent implements OnInit {
  welcomeMessageEng$!: Observable<string>;
  welcomeMessageFr$!: Observable<string>;

  private baseURL = 'http://localhost:8080';

  constructor(private httpClient: HttpClient) {
    console.log('WelcomeComponent instantiated');
  }

  ngOnInit(): void {
    // English message.  localhost:8080/welcome/?lang=en-us
    this.welcomeMessageEng$ = this.httpClient.get(
      `${this.baseURL}/welcome/?lang=en-US`,
      { responseType: 'text' }
    );

    // French Message. localhost:8080/welcome/?lang=fr-CA
    this.welcomeMessageFr$ = this.httpClient.get(
      `${this.baseURL}/welcome/?lang=fr-CA`,
      { responseType: 'text' }
    );
  }
}
