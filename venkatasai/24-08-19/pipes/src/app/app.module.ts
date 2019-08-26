import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'

import { AppComponent } from './app.component';

import { BuiltinPipesComponent } from './builtin-pipes/builtin-pipes.component';
import { ReversePipe } from './reverse.pipe';
import { ValidatorPipe } from './validator.pipe';

@NgModule({
  declarations: [
    AppComponent,
    
    BuiltinPipesComponent,
    
    ReversePipe,
    
    ValidatorPipe
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
