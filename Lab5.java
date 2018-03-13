package com.tasks3.linkedlist;

class LinkedList {
    private final Node begin;
    private Node end;
    private int num_ofEllem;
    public LinkedList() {
        begin = new Node();
        end = begin;
        this.num_ofEllem = 0;
    }

    public void add(Integer data) {

        end.setNext(new Node());
        end = end.getNext();
        end.setNext(null);
        end.setData(data);
        this.num_ofEllem++;
    }

    public Integer get(int index) {
        Node tbegin = begin;
        if (index >= this.num_ofEllem)
        {
            return null;
        }
        for(int i = 0; i < index + 1; i++)
        {

            tbegin = tbegin.getNext();
        }
        return tbegin.getData();
    }

    public boolean delete(int index) {
        Node tbegin = begin;
        if ((index < 0)||(index >= this.num_ofEllem))
            return false;
        for (int i = 0; i < index; i++) {
            if (tbegin != null)
                tbegin = tbegin.getNext();
            else
                return false;
        }
        if(tbegin.getNext().getNext() != null)
        {
            tbegin.setNext(tbegin.getNext().getNext());
        }
        else
        {
            tbegin.setNext(tbegin.getNext().getNext());
            end = tbegin;
        }
        num_ofEllem--;
        return true;


    }

    public int size() {
        return this.num_ofEllem;
    }

}
