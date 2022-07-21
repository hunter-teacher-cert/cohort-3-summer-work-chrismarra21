# Fraction Class
class Fraction: 

"""
This class represents a Fraction (n/d)
**Recommended days: 2 days**

Basic Level:
Constructor
toString
multiply
divide

Intermediate Level:
Reciprocal
add/subtract
simplify

Advanced Level:
GCF
"""

# Constructor
  # make a default constructor in the parameterized constructor
  def __init__(self): 
    """
    Declare and initialize a numerator and denominator attributes
    """


    # if the denominator is 0, set to 1

    # else, set it to the parameters
    
    
# toString method
  def __str__(self): 
    # should return a string representation of the fraction
    # choice of style is up to you!
    
    
# Multiplication 
  def times(self, anoFraction): 
    """
    this methods allows you to multiple with ANOTHER FRACTION OBJECT
    this does not return any value and modifies the ORIGINAL FRACTION

    For example:
    ~ Before ~
    f1 = 1/2 # ORIGINAL F
    f2 = 3/4 # ANOTHER F
    f1.times(f2)

    ~ After ~
    f1 = 3/8 # UPDATED ORIGINAL F
    """
    
    
# reciprocal
  def rec(self):
    
    
# division
  def divide(self, anoFraction): 
    

  def div2(self, anoFraction): 
    
    
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
     
          
  
    
# addition/subtraction
  def add(self, anoFraction): 
     

  def sub(self, anoFraction): 
     
    
    
# ----------- MAIN -----------

# 