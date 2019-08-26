import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'validator'
})
export class ValidatorPipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    
    if( value=="" || value==undefined){
      return "this is required field  :( "
    }
    return "All is Well";
  }

}
