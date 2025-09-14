# def simple_decorator(func):
#     def wrapper(*args, **kwargs):
#         print("Before call")
#         return func(*args, **kwargs)
#     return wrapper

# @simple_decorator
# def add(a: int, b: int) -> int:
#     return a + b

# print(add.__name__)
# print(help(add)) 
#단순히 *args, **kwargs로 감싸면 help()나 IDE의 자동완성에서 원래 함수의 인자 정보를 잃게 됩니다.

import inspect
from functools import wraps

def better_decorator(func):
    sig = inspect.signature(func)

    @wraps(func)
    def wrapper(*args, **kwargs):
        bound = sig.bind(*args, **kwargs)   # 인자 유효성 검사
        bound.apply_defaults()              # 기본값 적용
        print("Called with:", bound.arguments)
        return func(*args, **kwargs)
    return wrapper

@better_decorator
def add(a: int, b: int = 10) -> int:
    return a + b

print(add(5))
# 출력:
# Called with: OrderedDict([('a', 5), ('b', 10)])
# 15

print(help(add))  # 올바른 시그니처 출력 ✅