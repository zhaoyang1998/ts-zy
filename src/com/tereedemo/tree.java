package com.tereedemo;

public class tree {
    private treenode root;

    public void add(int data){
        if (root==null){
            root = new treenode(data);
        }else{
            root.addnoode(data);
        }
    }

    public void print(){
        root.printnode();
    }

    public class treenode{
        private int  data;
        private treenode left;
        private treenode right;

        private treenode(int data){
            this.data= data;


        }
        private treenode(){ }
        public void addnoode(int data){
            if (this.data>data){
                if (this.left==null){
                    this.left = new treenode(data);
                }else{
                    this.left.addnoode(data);
                }
            }else{
                if (this.right==null){
                    this.right = new treenode(data);
                }else{
                    this.right.addnoode(data);
                }

            }
        }

        //中序排列
        public void printnode(){
            if (this.left!=null){
                this.left.printnode();
            }
            System.out.println(this.data+">>");
            if(this.right!=null){
                this.right.printnode();
            }


        }


    }
}
