var targilForDisplay=""
var targil=""
var sum = 0
var sum2=0
// הפונקציה מקבלת קלט של תרגיל מהמשתמש ושולחת את התוצאה.
function Calculating(x,x2) {
    sum=0
    sum2=0   
  if(x=="")// בודק האם המשתמש לחץ על מחיקה ואז הפונקציה תוריד את מה שנרשם אחרון
  {
  targil=targil.substring(0,targil.length-1) 
  targilForDisplay=targilForDisplay.substring(0,targilForDisplay.length-1)
  }
  if(x=="y") // בודק האם המשתמש לוחץ על c ואז הפונקציה תאפס את התרגיל
  {
    targil=""  
    targilForDisplay="" 
  }
  else if(x=="="){// בודק האם משתמש לחץ = ואז הפונקציה תחזיר תוצאה
      var i=0
     s= targil.split(',')//לוקח תרגיל סטרינג והופך אותו למערך מפוצל ע"פ * - + / 
     s2=[]

      for(i;i<s.length;i++)// 
      {
        if (s[i].charAt(0)=='*')// בודק האם יש כפל בתרגיל אם כן שומר את התוצאה במשתנה sum
        {
            s[i]=s[i].replace(s[i].charAt(0),'')
            sum=sum*Number(s[i])
        }
        else if (s[i].charAt(0)=='/')// בודק האם יש חילוק בתרגיל אם כן שומר את התוצאה במשתנה sum
        
        {
            s[i]=s[i].replace(s[i].charAt(0),'')
            sum=sum/Number(s[i])      
        }
    
        else{// אם התנאים הקודמים לא מתקיימים דוחף את sum למערך חדש ומשנה את sum למספר הבא במערך
        s2.push(sum)
        sum=Number(s[i])      
        }      
    }
    s2.push(sum)                                                  
      i=0
      for(i;i<s2.length;i++){// מחשב את סכום המערך החדש
          sum2+=s2[i]
      }           
  }  
  targilForDisplay=targilForDisplay+x2;
  targil=targil+x;
  document.getElementById("demo").innerHTML = targilForDisplay;
  document.getElementById("demo2").innerHTML = sum2; 
}
