import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { SpeakComponent } from './speak/speak.component';
import { ListenComponent } from './listen/listen.component';

@NgModule({
  declarations: [
    AppComponent,
    SpeakComponent,
    ListenComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
