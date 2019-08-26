import { Pipe, PipeTransform } from '@angular/core';
import { stringify } from 'querystring';

@Pipe({
  name: 'reverse'
})
export class ReversePipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    var result : string=""
    var i=value.length-1
    while(i>=0){
      result=result+value[i]
      i--
    }
    return result;
  }

}
