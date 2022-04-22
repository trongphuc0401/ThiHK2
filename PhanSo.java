package bai1;

import java.util.Scanner;
public class PhanSo 
{
	int ts;  //tử số
	int ms;  //mẫu số
	
	public PhanSo()  //constructor không tham số
	{
		ts=0;
		ms=1;
	}
	public PhanSo(int tu,int mau) //constructor có tham số
	{
		ts=tu;
		ms=mau;
	}

	public void nhap()  //Nhập giá trị cho phân số
	{    //không được nhập mẫu số = 0
		int tu, mau;
		Scanner in = new Scanner(System.in);
		do{
			System.out.print("Nhập tử số : ");
			tu = in.nextInt();
			System.out.print("Nhập mẫu số: ");
			mau = in.nextInt();
		} while(mau==0);
		this.ts = tu; this.ms = mau;
	}

	public void toigian()   	//tối giản phân số
	{
		int tu = ts , mau = ms ;
		while(tu != mau) 	//tính Uscln của tu, mau
		{
			if(tu > mau)
				tu = tu - mau;
			else 
				mau = mau - tu;
		}
		ts = ts/tu;
		ms = ms/tu;
	}

	public void congPS(PhanSo  a, PhanSo b)  //Cộng phân số
	{
		int tuso,mauso;
		tuso = (a.ts * b.ms) + (b.ts * a.ms);
		mauso = (a.ms * b.ms);
		this.ts = tuso; this.ms = mauso;
		this.toigian();
	}

	public void truPS(PhanSo  a, PhanSo b)  //Trừ phân số
	{
		int tuso,mauso;
		tuso = (a.ts * b.ms) - (b.ts * a.ms);
		mauso = (a.ms * b.ms);
		this.ts = tuso; this.ms = mauso;
		this.toigian();
	}
	
	public void nhanPS(PhanSo  a, PhanSo b)  //Nhân phân số
	{
		int tuso,mauso;
		tuso = (a.ts * b.ts);
		mauso = (a.ms * b.ms);
		this.ts = tuso; this.ms = mauso;
		this.toigian();
	}
	
	public void chiaPS(PhanSo  a, PhanSo b)  //Chia phân số
	{
		int tuso,mauso;
		tuso = (a.ts * b.ms);
		mauso = (a.ms * b.ts);
		this.ts = tuso; this.ms = mauso;
		this.toigian();
	}
	
	public void hien()
	{
		System.out.println("\t" + ts + "/" + ms);
	}
	
	public static void main(String[] args) 
	{
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		PhanSo z = new PhanSo();
		int chon;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Phân Số và các Phép toán trên phân số");
			System.out.println("Bài Toán Phân Số");
			System.out.println("1/. Cộng phân số");
			System.out.println("2/. Trừ phân số");
			System.out.println("3/. Nhân phân số");
			System.out.println("4/. Chia phân số");
			System.out.println("5/. Kết thúc chương trình");
			System.out.print("Nhấn 1 số để chon:");
			chon = sc.nextInt();
			switch (chon)
			{
			case 1:
				//nhập 2 phân số x, y
				System.out.println("Nhập phân số thứ 1:");
				x.nhap();
				System.out.println("Nhập phân số thứ 2:");
				y.nhap();
				z.congPS(x,y);
				System.out.println("Kết quả phép cộng: ");
				x.hien();
				y.hien();
				z.hien();
				break;
			case 2:	
				//nhập 2 phân số x, y
				System.out.println("Nhập phân số thứ 1:");
				x.nhap();
				System.out.println("Nhập phân số thứ 2:");
				y.nhap();
				z.truPS(x,y);
				System.out.println("Kết quả phép trừ:");
				x.hien();
				y.hien();
				z.hien();
				break;
			case 3:
				//nhập 2 phân số x, y
				System.out.println("Nhập phân số thứ 1:");
				x.nhap();
				System.out.println("Nhập phân số thứ 2:");
				y.nhap();
				z.nhanPS(x,y);
				System.out.println("Kết quả phép nhân:");
				x.hien();
				y.hien();
				z.hien();
				break;
			case 4:	
				//nhập phân số x, y
				System.out.println("Nhập phân số thứ 1:");
				x.nhap();
				System.out.println("Nhập phân số thứ 2:");
				y.nhap();
				z.chiaPS(x,y);
				System.out.println("Kết quả phép chia:");
				x.hien();
				y.hien();
				z.hien();
				break;
			}
		} while (chon <= 4);
		sc.close();
		System.out.println("Kết thúc chương trình.");
	}
}
