def anagram(a,b):  
    x=a.lower()
    a=x.replace(" ", "") 
    y=b.lower()
    b=y.replace(" ", "")
    c=list(a)
    d=list(b)
    c.sort()
    count=0
    d.sort()
    if(len(c)==len(d)):
        for i in range (len(c)):
            if c[i]!=d[i]:
                count = count+1
        if count==0:
            print("True")
        else:
            print("False")
    else:
        print("False")
a= "anagram"
b= "nagaram"
anagram(a,b)
a="Keep"
b="Peek"
anagram(a,b)
a="Mother In Law"
b="Hitler Woman"
anagram(a,b)
a="School Master"
b="The Classroom"
anagram(a,b)
a="ASTRONOMERS"
b= "NO MORE STARS"
anagram(a,b)
a="Toss"
b="Shot"
anagram(a,b)
a="joy"
b="enjoy"
anagram(a,b)
a="Debit Card"
b="Bad Credit"
anagram(a,b)
a=" SiLeNt CAT"
b=" LisTen AcT "
anagram(a,b)
a=" Dormitory"
b=" Dirty Room"
anagram(a,b)

    
    
    
        
    
