# BASIC Algorithm
```
이 저장소는 알고리즘의 기초를 다시 처음부터 적기 위하여 작성한 저장소입니다.
```
```
this repository was created for fundamentals of algorithms
```

## Study Goal

```
제 코딩실력을 위해서 매일 공부하기위해 노력할것입니다.
취업의 준비도 있겠지만 그런것이아닌 제 자신의 가치를 증명하고 향상시키기위한 목적입니다.
```
```
For my coding level, I will try to study everday.
While preparing for employment is one reason,
my primary goal is to demonstrate and enhance my personal value.
```

## Progress Update

Do it 알고리즘테스트

[1] 디버깅 오류
[2] 시간복잡도_판별원리1
[3] time complex
[4] BufferReader BufferWriter vs Scanner


## 잊지 말아야할것들.

1. 코드 구현은 의사 결정 자연어 부터 코딩까지로 설계하기.
2. GPT등 생성형 모델들이 만든 코드들도 좋지만 그것마저 인터넷에 있는 사람들이 사용한 코드를 발췌한거란 사실.
3. 코딩의 방법들은 계속해서 진화한다. 처음부터 잘할생각이아니라 리팩토링을 할 생각하자.

## 공부하면서 느끼게 된것들.

### day 9/9
1. 프로그래밍에서 제일 먼저 생각해야할것은 문제정의 능력이다. 문제해결능력도 중요하지만 문제를 어떤식으로 정의하는가에 따라 달라진다고생각한다.
2. 문제정의가 끝난뒤 문제 해결방법들을 추론해낸다. 그 추론 방법들을 코딩할 수 있게된다.
3. 코딩한 것들을 시간복잡도와 이런걸 따져서 조금더 효율적이게 리팩토링을 진행한다.

### day 9/10 
1. GRPO-RoC (Group Relative Policy Optim - Resample of Correct) 를 공부
2. 여기서 든 의문점 Negative를 다운 샘플링 한다고 하였을때 왜 보상이 낮은걸로 다운샘플링은하지않는가? 
3. 편향이 일어나지 않기위해서 Negative의 특정성만이아닌 general한 Negative를 추려내기위해서 그렇다.
4. 그럼 Random이란것은 General하다고 볼 수 있는건가?  아니다. 오류 측면에서 general하게 만들기위해 random을 추출하는것뿐 의미가 같진않다.
5. rstar2에서 다른점. 추론능력에 집중을한것이 아닌 non reasoning으로시작해서 coding utilize tool and formatting에 초점을두고 rollout을 다운샘플링하였다.
    •	도구 기반 AI (Tool-augmented AI)의 성능은 모델 + 툴의 조합으로 결정됩니다.
	•	좋은 LLM이 있다 해도, “부실한 Tool”이 있으면 정답을 못 찾습니다.
	•	따라서 LLM을 훈련하거나 활용할 때는 Tool 또한 함께 설계하고 최적화해야 합니다.

