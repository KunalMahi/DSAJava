package com.ds.equalSubtree;

public class Subtree {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			Node n1=new Node("A",null,null,null);
			Node n2=new Node("B",null,null,null);
			Node n3=new Node("C",null,null,null);
			Node n4=new Node("D",null,null,null);
			Node n5=new Node("E",null,null,null);
			Node n6=new Node("F",null,null,null);
			Node n7=new Node("G",null,null,null);
			Node n8=new Node("H",null,null,n4);
			n1.left=n2;
			n1.right=n3;
			n2.left=n4;
			n2.right=n5;
			n3.left=n6;
			n3.right=n7;
			n2.parent=n1;
			n3.parent=n1;
			n4.parent=n2;
			n5.parent=n2;
			n6.parent=n3;
			n7.parent=n3;
			n4.left=n8;
			int f=0;
			Node target=n4;
			int total=explore(n1);
			int left=0,right=0,parent=0;
			left=explore(target.left);
			if(target.right!=null)
			right=explore(target.right);
			System.out.println(total);
			parent=total-left-right-1;
			if(left==right && left==parent) {
				f=1;
			}
			else {
				if(parent == 0 && left==right)
					f=1;
				else if(parent==left && right==0)
					f=1;
				else if(parent==right && left==0)
					f=1;
				else if(left==0 && right==0)
					f=1;
				else if (left ==0 && parent ==0)
					f=1;
				else if(right ==0 && parent ==0)
					f=1;
			}
			System.out.println(left+ " "+right+ " "+parent);
			if(f==0) {
				System.out.println("Not equal");
			}
			else {
				System.out.println("Equal");
			}
		}
		public static int explore(Node n) {
			if(n==null) {
				System.out.println("Reached ENd");
				return 0;
				
			}
			System.out.println("Exploring"+n.value);
			int ans=1;
			ans=ans+explore(n.left);
			ans=ans+explore(n.right);
			return ans;
		}

	}


