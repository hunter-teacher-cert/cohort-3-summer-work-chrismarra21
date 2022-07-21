# Fraction Class
class Fraction: 
  
# Constructor
  def __init__(self, num = 1, den = 1): 
    self.num = num 
    self.den = den
    
# toString method
  def __str__(self): 
    output = ""
    if self.den == 0: 
      output = "Undefined"
    elif self.num == 0: 
      output = "0"
    elif self.den == 1: 
      output = str(self.num)
    elif self.den == self.num: 
      output = "1"
    else: 
      output = str(self.num) + "/" + str(self.den)
    return output
    
# Multiplication 
  def times(self, anoFraction): 
    newNum = self.num * anoFraction.num
    newDen = self.den * anoFraction.den
    output = Fraction(newNum, newDen) #toString method 
    return output 
    
# reciprocal
  def rec(self):
    newNum = self.den
    newDen = self.num
    output = Fraction(newNum, newDen)
    return output
    
# division
  def divide(self, anoFraction): 
    newNum = self.num * anoFraction.den
    newDen = self.den * anoFraction.num
    output = Fraction(newNum, newDen)
    return output 

  def div2(self, anoFraction): 
    newF = anoFraction.rec()
    output = self.times(newF)
    return output 
    
# simplfy/gcf
  def simp(self): 
    great = self.gcf()
    self.num /= great 
    self.den /= great     
    
  # def gcf(self): 
  #   gre = math.gcd(self.num, self.den)
  #   newNum = self.num / gre
  #   newDen = self.den / gre
  #   output = Fraction(newNum, newDen)
  #   return output
    
  def gcf(self): 
    newNum = abs(self.num)
    newDen = abs(self.den)
    if self.num == 0 or self.den == 0: 
      output = 1
    else: 
      while newNum != newDen: 
        if newDen < newNum: 
          newNum -= newDen
        elif newDen > newNum: 
          newDen -= newNum
      output = newNum
      return output 
          
  
    
# addition/subtraction
  def add(self, anoFraction): 
    newNum1 = anoFraction.den * self.num 
    newDen = self.den * anoFraction.den
    newNum2 = anoFraction.num * self.den
    sum = newNum1 + newNum2
    output = Fraction(sum, newDen)
    return output 

  def sub(self, anoFraction): 
    newNum1 = anoFraction.den * self.num 
    newDen = self.den * anoFraction.den
    newNum2 = anoFraction.num * self.den
    sum = newNum1 - newNum2
    output = Fraction(sum, newDen)
    return output 
    
    
# ----------- MAIN -----------
f1 = Fraction(1,6)
print(f1)
f2 = Fraction(3,2)
f3 = Fraction(3,4)
t1 = f2.times(f3) #f2 is self and f3 is another fraction 
print(t1)
d1 = f2.divide(f3) 
print(d1)
r1 = f3.rec()
print(r1)
d2 = f2.div2(f3)
print(d2)
a1 = f2.add(f3)
print(a1)
s1 = f2.sub(f3)
print(s1)
g1 = s1.gcf()
print(g1)
s1.simp() #we are simplifying the same fraction so we don't need the return or new fraction
print(s1)





# f4 = Fraction(12,18)
# f5 = Fraction(30,10)
# f6 = Fraction (36,24)
# s1 = f4.simp()
# print(s1)
# print(f5.simp())
# print(f6.simp())