import inspect


def add(a, b=1):
    return a + b

def call_function(func, **kwargs):
    sig = inspect.signature(func)
    bound = sig.bind(**kwargs)   # 전달된 인자를 검증하고 정렬
    bound.apply_defaults()
    return func(*bound.args, **bound.kwargs)

print(call_function(add, a=5))


plugins = {}

def register(func):
    plugins[func.__name__] = func
    return func

@register
def greet(name: str):
    return f"Hello {name}!"

@register
def multiply(x: int, y: int = 2):
    return x * y

def run_plugin(main_name, **kwargs):
    func = plugins[main_name]
    sig = inspect.signature(func)
    bound = sig.bind(**kwargs)
    print("print(bound) :",bound)
    print("print(bound.apply_defaults :)",bound.apply_defaults())
    print("func(*bound.args) :",*bound.args)
    print("func(**bound.kwargs) :",**bound.kwargs)
    return func(*bound.args, **bound.kwargs)

print(run_plugin("greet", name="DoHun"))   # Hello DoHun!
