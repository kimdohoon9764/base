class Comparable:
    def toString(self):
        ... 
    def comPareTo(self):
        ...
class Score(Comparable):
    """
    점수를 비교할때의 영어 기준을 우선적으로 영어 점수가 같으면 수학점수 리턴 같지않으면 영어점수 리턴 하는 클래스
    """
    
    def __init__(self,english : int,math : int)-> None:
        self.english=english
        self.math=math
        
        
    def __str__(self)->str:
        print(f"Score: english -> {self.english} , math -> {self.math}")
        
    def compareTo(self,object:"Score"):
        if (self.english == object.english): 
            return object.math - self.math
        return object.english - self.english
        

    