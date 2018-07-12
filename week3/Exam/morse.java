def morse(string):
    d={'A':".-",'B':"-...",
    'C' :"-.-.",
    'D':"-..",
    'E' :".",
    'F' :"..-.",
    'G':"--.",
    'H' :"....",
    'I' :"..",
    'J' :".---",
    'K' :"-.-",
    'L' :".-..",
    'M' :"--",
    'N' :"-.",
    'O' :"---",
    'P' :".--.",
    'Q' :"--.-",
    'R' :".-.",
    'S' :"...",
    'T' :"-",
    'U' :"..-",
    'V' :"...-",
    'W' :".--",
    'X' :"-..-",
    'Y' :"-.--",
    'Z' :"--.."	,
    }
    l=[]
    
    s=''
    for i in string:
        s=''
        for x in i:
            s=s+d[x.upper()]
        
        l.append(s)
    m=set(l)
    print(len(m))
x= ["gin", "zen", "gig", "msg"]
morse(x)
y=["a", "z", "g", "m"]
morse(y)
z=["bhi", "vsv", "sgh", "vbi"]  
morse(z)
k=["a", "b", "c", "d"]  
morse(k)
n= ["hig", "sip", "pot"]
morse(n)

        
    
    
        
