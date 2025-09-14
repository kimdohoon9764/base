import inspect

def add(a:int,b:int,*args,**kwargs)->int:
    return a+b


sig = inspect.signature(add)
print(sig)
print(sig.parameters)


# for name, param in sig.parameters.items():
#     print(f"이름: {name}")
#     print(f"  kind: {param.kind}")        # POSITIONAL_ONLY, VAR_POSITIONAL 등
#     print(f"  기본값: {param.default}")   # default 값
#     print(f"  타입힌트: {param.annotation}") # type hint
#     print("---")
    
arguments=[]    
for param in sig.parameters.values():
    annotation_name={
        param.annotation.__name__
        if hasattr(param.annotation,'__name__')
        else str(param.annotation)
    }
    arguments.append((param.name,annotation_name))
    
print(arguments)