import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FormsModule} from '@angular/forms'
import { AppComponent } from './app.component';
import { SpeakComponent } from './speak/speak.component';
import { ListenComponent } from './listen/listen.component';
import { CommunicatorComponent } from './communicator/communicator.component';

@NgModule({
  declarations: [
    AppComponent,
    SpeakComponent,
    ListenComponent,
    CommunicatorComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
