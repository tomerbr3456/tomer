var targilForDisplay=""
var targil=""
var sum = 0
var sum2=0
function Calculating(x,x2) {
    sum=0
    sum2=0   
  if(x=="")
  {
  targil=targil.substring(0,targil.length-1) 
  targilForDisplay=targilForDisplay.substring(0,targilForDisplay.length-1)
  }
  if(x=="y")
  {
    targil=""  
    targilForDisplay="" 
  }
  else if(x=="="){
      var i=0
     s= targil.split(',')
     s2=[]

      for(i;i<s.length;i++)
      {
        if (s[i].charAt(0)=='*')
        {
            s[i]=s[i].replace(s[i].charAt(0),'')
            sum=sum*Number(s[i])
        }
        else if (s[i].charAt(0)=='/')
        
        {
            s[i]=s[i].replace(s[i].charAt(0),'')
            sum=sum/Number(s[i])      
        }
    
        else{
        s2.push(sum)
        sum=Number(s[i])      
        }      
    }
    s2.push(sum)                                                  
      i=0
      for(i;i<s2.length;i++){
          sum2+=s2[i]
      }           
  }  
  targilForDisplay=targilForDisplay+x2;
  targil=targil+x;
  document.getElementById("demo").innerHTML = targilForDisplay;
  document.getElementById("demo2").innerHTML = sum2; 
}