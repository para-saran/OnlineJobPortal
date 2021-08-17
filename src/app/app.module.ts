import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RegisterComponent } from './register/register/register.component';
import { JobSearchComponent } from './search/job-search/job-search.component';
import { JobListComponent } from './list/job-list/job-list.component';
import { JobDescriptionComponent } from './description/job-description/job-description.component';
import { JobHistoryComponent } from './history/job-history/job-history.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    JobSearchComponent,
    JobListComponent,
    JobDescriptionComponent,
    JobHistoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
