import java.util.*;
public class drink{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int gt,bt,mt,dt,rt;
		int sum,suum,giv,tal=0;
		int i=1;
		String nex,con,ans;
		System.out.println("紅茶20元 綠茶20元 奶茶45元 冬瓜茶30元 麥茶25元");
		do{
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("第"+i+"位客戶訂購: ");
			System.out.print("紅茶: ");
			bt=in.nextInt();
			System.out.print("綠茶: ");
			gt=in.nextInt();
			System.out.print("奶茶: ");
			mt=in.nextInt();
			System.out.print("冬瓜茶: ");
			dt=in.nextInt();
			System.out.print("麥茶: ");
			rt=in.nextInt();
			sum=bt*20+gt*20+mt*45+dt*30+rt*25;
			suum=bt+gt+mt+dt+rt;
			giv=suum/5;
			sum=sum-(giv*20);
			System.out.println("第"+i+"位客戶訂購共"+suum+"杯折"+giv+"次20元金額共"+sum+"元");
			i++;
			tal+=sum;
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("本日營業額累計: "+tal+"元");
			System.out.print("是否繼續營業?(y/n): ");
			nex=in.next();
			if(nex.equals("y")){
				con=("y");
			}
			else{
				System.out.print("確定要離開嗎?(y/n)");
				ans=in.next();
				if(ans.equals("n")){
					con=("y");
				}
				else{
					con=("n");
				}
			}
		}
		while(con.equals("y"));	
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("本日結束營業");
		System.out.println("本日總營業額: "+tal+"元");
	}
}

/*
綠茶20 紅茶20 奶茶45 冬瓜30 茶麥茶25
第一個人:56789
2:47826
3:45454
4:32146
*/