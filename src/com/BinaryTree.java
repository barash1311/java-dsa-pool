package com;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
     static class  Node {
        int data;
        Node left;
        Node right;

        public  Node(int data) {
            this.data = data;
        }
    }
        public static Node root;
        // Inorder-- left root right
        public static void inOrder(Node root){
            if(root!=null){
                inOrder(root.left);
                System.out.print(root.data+" ");
                inOrder(root.right);
            }
        }
        public  static void preOrder(Node root){
            if(root!=null){
                System.out.println(root.data+" ");
                preOrder(root.left);
                preOrder(root.right);
            }
        }
        public static void postOrder(Node root){
            if(root!=null){
                postOrder(root.left);
                postOrder(root.right);
                System.out.println(root.data+" ");
            }
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            return Math.max(height(root.left),height(root.right))+1;
        }
        public static void printNodeAtHeight(Node root,int height){
            if(root==null){
                return;
            }
            if(height==1){
                System.out.print(root.data+" ");
            }
            printNodeAtHeight(root.left,height-1);
            printNodeAtHeight(root.right,height-1);
        }
        public  static void levelTraverse1(Node root){
            int height=height(root);
            for(int i=1;i<=height;i++) {
                printNodeAtHeight(root, i);
                System.out.println();
            }
        }
        public static void levelTraverse2(Node root){
            if(root==null)return;
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node current=queue.poll();
                System.out.print(current.data+" ");
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
        }
        public static void printLevelTraverse(Node root){
            if(root==null){
                return;
            }
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while(queue.size()>1){
                Node current=queue.poll();
                if(current==null){
                    System.out.println();
                    queue.add(null);
                    continue;
                }
                System.out.print(current.data+" ");
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
        }
        public static int size(Node root){
            int count=0;
            if(root== null){
                return 0;
            }
            int left=size(root.left);
            int right=size(root.right);
            return left+right+1;
        }
        public static int maxValue(Node root){
            if(root==null){
                return Integer.MIN_VALUE;
            }
            int left=maxValue(root.left);
            int right=maxValue(root.right);
            return Math.max(root.data,Math.max(left,right));
        }
        static int maxLevel=0;
        static void printLeft(Node root,int level){
            if(root==null){
                return;
            }
            if(maxLevel<level){
                System.out.println(root.data+" ");
                maxLevel=level;
            }
            printLeft(root.left,level+1);
            printLeft(root.right,level+1);
        }
        public static void printLeftView(Node root){
            printLeft(root,1);
        }
        public static boolean checkChildrenSum(Node root){
            if(root==null) return true;
            if(root.left==null && root.right==null) return true;
            int sum=0;
            if(root.left!=null) sum+=root.left.data;
            if(root.right!=null) sum+=root.right.data;
            return ( root.data==sum && checkChildrenSum(root.left) && checkChildrenSum(root.right) );
        }
        public static boolean isBalance(Node root){
            if(root==null) return true;
            int leftHeight=height(root.left);
            int rightHeight=height(root.right);
            return (Math.abs(leftHeight-rightHeight)<=1 && isBalance(root.left) && isBalance(root.right));
        }
        public static int isBalance2(Node root){
            if(root==null) return 0;
            int leftHeight=isBalance2(root.left);
            if(leftHeight==-1){ return -1;}
            int rightHeight=isBalance2(root.right);
            if(rightHeight==-1){ return -1;}
            if(Math.abs(leftHeight-rightHeight)>1) return -1;
            else return Math.max(leftHeight,rightHeight)+1;
        }
        public int maxWidth(Node root){
            if(root==null) return 0;
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            int res=0;
            while(!queue.isEmpty()){
                int count=queue.size();
                res=Math.max(res,count);
                for(int i=0;i<count;i++){
                    Node curr=queue.poll();
                    if(curr.left!=null){
                        queue.add(curr.left);
                    }if(curr.right!=null){
                        queue.add(curr.right);
                    }
                }
            }
            return res;
        }

        public static void main(String[] args) {
            Node root=new Node(10);
            root.left=new Node(20);
            root.right=new Node(30);
            root.left.left=new Node(8);
            root.left.right=new Node(7);
            root.left.right.left=new Node(9);
            root.left.right.right=new Node(15);
            root.right=new Node(30);
            root.right.right=new Node(6);
//            levelTraverse1(root);
//            System.out.println();
//            levelTraverse2(root);
//            System.out.println();
//            printLevelTraverse(root);
//            System.out.println();
//            System.out.println(size(root));
//            System.out.println(maxValue(root));
            printLeftView(root);










        }
    }

