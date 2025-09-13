# Agent

## What is Agent?
- Understanding Agents
    - What is an Agent, and how does it work?
    - How do Agents make decisions using reasoning and planning?

- The Role of LLMs (Large Language Models) in Agents
    - How LLMs serve as the “brain” behind an Agent.
    - How LLMs structure conversations via the Messages system.
## What is Ollama?
1. LLm이 발전 하면서 클라우드 통해서만 사용이 가능하고 비용이 발생했다.
2. 이를 해결하고자 나온게 Ollama 모델을 다운로드받고 내부 API통신으로 모델 활용도를 높인다. 
3. 모델 관리도 자동화 
4. 내부 통신을 사용하기에 외부로 민감 데이터가 외부에 노출 될 일이 없다.
5. HTTP 통신으로 관리하기때문에 직접 모델을 다운로드 하였을땐 python으로 언어가 한정적이지만 다른 언어들도 사용할수있다.





## Agent tutorial

#### Step 1
Running Models Locally with Ollama (In case you run into Credit limits)


install ollama [here](https://ollama.com/download)
pull qwen2:7b model
```
ollama pull qwen2:7b
```

Start ollama Background (In one terminal)
```
ollama serve
```

Use LiteModel
```cmd
pip install 'smolagents[litellm]'
```

Code 
```python
from smolagents import LiteLLMModel

model = LiteLLMModel(
    model_id="ollama_chat/qwen2:7b",  # Or try other Ollama-supported models
    api_base="http://127.0.0.1:11434",  # Default Ollama local server
    num_ctx=8192,
)
```

1. Why it Works?
- Ollama serves models locally using an OpenAI-compatible API at http://localhost:11434.
- LiteLLMModel is built to communicate with any model that supports the OpenAI chat/completion API format.
- This means you can simply swap out InferenceClientModel for LiteLLMModel no other code changes required. It’s a seamless, plug-and-play solution.


##### Agent Spectrum


| Agency Level | Description | What that’s called | Example pattern |
|--------------|------------|--------------------|-----------------|
| ☆☆☆ | Agent output has no impact on program flow | Simple processor | `process_llm_output(llm_response)` |
| ★☆☆ | Agent output determines basic control flow | Router | `if llm_decision(): path_a() else: path_b()` |
| ★★☆ | Agent output determines function execution | Tool caller | `run_function(llm_chosen_tool, llm_chosen_args)` |
| ★★★ | Agent output controls iteration and program continuation | Multi-step Agent | `while llm_should_continue(): execute_next_step()` |
| ★★★ | One agentic workflow can start another agentic workflow | Multi-Agent | `if llm_trigger(): execute_agent()` |