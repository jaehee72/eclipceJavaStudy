package java_study2.co.kr.jungbu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class L16StreamAPIEx2 {

	//쇼핑몰에서 판매하는 상품 자료 type = Variable Object(VO), Data Transfer Object(DTO) 데이터전송할때 임시 저장되는 페이지로 쓰인다 
	//key:value 로 되어있는 가장 인기있는 자료구조 : JavaScriptObjectNotatioin :원랜 데이터 객체 명세서로 만들어진 것이다 ! =>리터럴 표기법 ->문자열 통신으로 사용  
	//{"Products":[{"name":"desk","price":60000,"category":4,"quantity":55}]}
//	enum Cate{ //카테고리의 열거형  => 각 필드가 고유한 값을 갖는 상수 따라서 수를 사용하는 다른 상수와 섞어 쓰지 않는다 (고유값을 갖기 때문에 자바 내부에서만 슬 수 있다) 
//		식품,의류,가구,문구류,침구류 
//	}
	
	interface Cate{ //카체고리로 int 와 string 모두 쓰고싶을 때 번호도 필요하고 이름도 필요할떄 , db 에 저장하는 분류가 보통 수로 되어있기 때문에 열거형이 아니라 숫자로 된 상수를 사용한다 . (통신을 할때) 
		public static int 식품 = 0;
		public static int 의류 = 1;
		public static int 가구 = 2;
		public static int 문구 = 3;
		public static int 침구 = 4;
	}
	class ProductDTO{
		//class의 전역에  선언된 변수 : 전역변수 , 객체의 필드로 생성됨( 속성) 
		String name;
		int price =0;
		int category; //0:식품 , 1: 의류 2:가구 3: 문구류 4: 침구류 (약속)
		int quantity = 10; // 기본으로 10개를 준다 
		
		//생성자로 필드 초기화 : 생성자의 return 이 없는 이유 ???-> 생성자는 new연산자로 호출하면 객체를 반환하는 함수다. 이름이 반환하는 타입인 함수다 그래서 이름 자체가 반환하는 타입이 된다 
		public ProductDTO(String name,int price, int category) {
			//필드 접근자 ! this
			this.name = name;
			this.price = price; 
			this.category = category;

		}
		//생성자는 같지만 매개변수가 다른 애들은 오버로드라고 한다 
		public ProductDTO(String name,int price, int category, int quantity) {
			//필드 접근자 ! this
			this.name = name;
			this.price = price; 
			this.category = category;
			this.quantity = quantity;
		}
		
		@Override
	      public String toString() {
	         return "ProductDTO {name:" + name + ", price:" + price + ", category:" + category + ", quantity:" + quantity
	               + "}\n";
	      }
		
		public int sum(int a,int b) {return a+b;} //함수는 반환하는  data 의 type 을 명시한다 .
	}
	public static void main(String[] args) {
		
		L16StreamAPIEx2 ex2=new L16StreamAPIEx2();
		List<ProductDTO> products=new ArrayList<ProductDTO>();
		
		products.add(ex2.new ProductDTO("허쉬 초콜릿", 1000, Cate.식품));
		products.add(ex2.new ProductDTO("허쉬 초콜릿 우유", 1200, Cate.식품, 5));
		products.add(ex2.new ProductDTO("바나나 단지 우유", 1500, Cate.식품, 3));
		products.add(ex2.new ProductDTO("돼지바", 900, Cate.식품, 15));
		products.add(ex2.new ProductDTO("하겐다즈 바닐라", 5000, Cate.식품,11));
		products.add(ex2.new ProductDTO("소세지 도시락", 3500, Cate.식품,3));
		products.add(ex2.new ProductDTO("도시락 컵라면", 800, Cate.식품,50));
		
		products.add(ex2.new ProductDTO("hp 연필", 500, Cate.문구,200));
		products.add(ex2.new ProductDTO("지우개", 500, Cate.문구,50));
		products.add(ex2.new ProductDTO("볼펜", 1000, Cate.문구,100));
		products.add(ex2.new ProductDTO("화이트 지우개", 2500, Cate.문구,3));
		
		products.add(ex2.new ProductDTO("흰색 셔츠", 10000, Cate.의류,0));
		products.add(ex2.new ProductDTO("나이키 반팔 티", 25000, Cate.의류,5));
		products.add(ex2.new ProductDTO("나이키 신발", 110000, Cate.의류,2));
		products.add(ex2.new ProductDTO("아디다스 신발", 95000, Cate.의류,2));
		
		products.add(ex2.new ProductDTO("여름용 이불", 25000, Cate.침구,1));
		products.add(ex2.new ProductDTO("솜 베게", 2000, Cate.침구,10));
		products.add(ex2.new ProductDTO("대나무 베게", 2000, Cate.침구,0));
		products.add(ex2.new ProductDTO("침대 커버 퀸", 15000, Cate.침구,3));
		
		products.add(ex2.new ProductDTO("행거", 60000, Cate.가구,1));
		products.add(ex2.new ProductDTO("책상", 45000, Cate.가구,1));
		products.add(ex2.new ProductDTO("듀오백의자", 145000, Cate.가구,3));
		
		System.out.println(products.toString());
		//편의점 관리 프로그램 
		//편의점 상품 저장 
		//편의점 상품 분류, 상품의 수가 없는것을 확인, 분류별 상품 가격 평균 => 관ㄹㅣ(자료를다루는 방법) 
		
		//식품 중 가격이 2000원 이상인 것을 검색하고 싶다 

		List<ProductDTO> foods = new ArrayList<ProductDTO>();
		for(ProductDTO p : products) {
			if(p.category==Cate.식품 && p.price >=2000) {
				foods.add(p);
			}
		} //외부 반복문 검사식 ( 함수형 언어가 지원하는 내부 반복문 보다 복잡도가 높다)  
//		System.out.println(foods);
		
		Optional<String> namesOpt = products.stream()  // list 를 stream 자료구조로 바꾸겠다 !! stream 은 자료구조 일부임Optional 은 뭐냐 
		.filter((p)->p.category==Cate.식품) //filter 는 중간 연산자 ! Stream 을 다시 반환하기 때문이다. true 인거만 반환하는거임 -> 이어서 중간 연산가능 
		.filter((p)->p.price >= 2000)
		.map((p)->(p.name)) //중간연산자 반환하는 것으로 자료를 변환해줌  만약 이름만 필요하다면 product를 매개변수로 받고 이름을 반환 
		.reduce((s,s1)->s+","+s1); //reduce 는 최종 연산이라 맨 아래의 foreach 못쓴다 // 매개변수 두개 받아서 어떻게 반환할지 정할 수 있음 최종연산 BiOperator : (s1,s2) ->{return s3} 
//		.forEach((p)->{System.out.println(p);});	//바꾸고 싶은게 있으면 중간연산만 바꾸면 되기 때문에 코드의 재사용이 좀 더 쉬워진다 (수정과 삭제가 용이함) 
		//reduce 동작 원리 : nums = {10,20,30,40,50,60,70} result = 0
		//(s1,s2) -> s1+s2;
		//0: result += nums[0]+nums[1] ;
		//1: result += nums[1];
		// . . . .
		//end : result += nums[nums.length-1] => return result;
		
		System.out.println(namesOpt.get()); //optional 을 주는 이유가 여기서 나온다 type 이 optional 이니 null 이 나올 수 있으늬까 if 문으로 처리하라는 뜻임 !!!! 
		
		//카테고리가 가구인 것의 평균을 구하세요 !!
		
		Optional<Integer> sumOpt = products.stream() //null 일수 있는걸 반환하려고 optional 을 만듬 
		.filter((p)->p.category==Cate.가구)
		.map(p->p.price*p.quantity)
		.reduce((p1, p2)->p1+p2);
//		.mapToInt((p)->p.price*p.quantity) //총 가격을 구하기 위해 mapToInt 를 사용하면 (기본형 스트링의 장점 : 1. null이 아니다 그래서 sum() 을 사용가능해짐 2. 연산하는 함수를 작성할 수 있다. ) 
//		.sum(); //map 으로 인해  int 로 되어있음 
//		.forEach(p->System.out.println(p));
		System.out.println(sumOpt);
		

		
		///////////OPTIONAL/////////////////
		
		Integer i = null;
//		System.out.println(i+10); //null 이기 때문에 (참조형이라 기본값이 null임) 오류가 뜨게 된다 	i에 값을 넣어줘야지 에러가 안나옴 
		i = 30;
		System.out.println(i+10); //이러한 오류가 너무 자주 나오게됨 !!
		
		//Optional : data 가 Null 일 수 잇으니 처리하도록 명시하는 타입 
		Optional<Integer> i_opt = Optional.empty(); //null 은 안되고 이렇게 선언해줘야함 !!!
		i_opt =Optional.ofNullable(99); //null 일 수도있다는 것을 명시 ! 
		
		if(i_opt.isPresent()) { //값이 들어가 있다면 (isEmpty 랑 반대임) 
			System.out.println(i_opt.get()+20);
		}else {
			System.out.println("isPresent() 는 값이 있을때만 True 를 반환 , isEmpty() 는 Null일때만 True 반환 ");
		} 
		
		//반환 데이터가 Null 일 수 있음을 type 으로 명시하는 것임 
//		i_opt.ifPresent((num)->{
//			System.out.println("값이 있을때만 실행되는 함수 ! ");
//		});
		
		i_opt.ifPresentOrElse((num) ->{
			System.out.println("값이 있을 때만 실행");
		}, ()->{System.out.println("null 일때 실행");
		});
		
		
		////////stream groupingBy //////////
		Map<Integer,List<ProductDTO>> groupingList = products.stream()
		.collect(Collectors.groupingBy(p->p.category)); //해당 객체의 특성 필드로 반환하면 해당 필드를 key로 하는 list로 그루핑 된다 
		
		System.out.println(groupingList);
		System.out.println(groupingList.get(Cate.의류));
		
		
		//////////////stream partitioningBy  true or false 의 2 그룹으로 나누는 것 //////////////
	}

}
