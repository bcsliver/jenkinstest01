import java.util.*;
public class drink{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int gt,bt,mt,dt,rt;
		int sum,suum,giv,tal=0;
		int i=1;
		String nex,con,ans;
		System.out.println("����20�� ���20�� ����45�� �V�ʯ�30�� ����25��");
		do{
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("��"+i+"��Ȥ�q��: ");
			System.out.print("����: ");
			bt=in.nextInt();
			System.out.print("���: ");
			gt=in.nextInt();
			System.out.print("����: ");
			mt=in.nextInt();
			System.out.print("�V�ʯ�: ");
			dt=in.nextInt();
			System.out.print("����: ");
			rt=in.nextInt();
			sum=bt*20+gt*20+mt*45+dt*30+rt*25;
			suum=bt+gt+mt+dt+rt;
			giv=suum/5;
			sum=sum-(giv*20);
			System.out.println("��"+i+"��Ȥ�q�ʦ@"+suum+"�M��"+giv+"��20�����B�@"+sum+"��");
			i++;
			tal+=sum;
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("������~�B�֭p: "+tal+"��");
			System.out.print("�O�_�~����~?(y/n): ");
			nex=in.next();
			if(nex.equals("y")){
				con=("y");
			}
			else{
				System.out.print("�T�w�n���}��?(y/n)");
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
		System.out.println("���鵲����~");
		System.out.println("�����`��~�B: "+tal+"��");
	}
}

/*
���20 ����20 ����45 �V��30 ������25
�Ĥ@�ӤH:56789
2:47826
3:45454
4:32146
*/