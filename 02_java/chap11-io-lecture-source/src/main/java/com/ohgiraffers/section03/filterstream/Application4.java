package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {

        MemberDTO[] members = new MemberDTO[3];
        members[0] = new MemberDTO("user1","pass01","홍길동","h0ong123@gmail.com"
        , 25,'남');
        members[1] = new MemberDTO("user02","pass02","유관순","Korea31@gmail.com"
                , 16,'여');
        members[2] = new MemberDTO("user03","pass03","강감찬","kang@gmail.com"
                , 38,'남');

        String path = "src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt";

        ObjectOutput oos = null;
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    path
                            )
                    )
            );

            for(int i = 0; i<members.length;i++){
                oos.writeObject(members[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                if(oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        MemberDTO[] newMembersDTO = new MemberDTO[members.length];
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));
            int index = 0;
            while(true){
                newMembersDTO[index] = (MemberDTO)ois.readObject();
                index++;
            }
        }catch (EOFException e){
            System.out.println("외원 읽기 끝!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("===== 읽어들인 회원들 =====");
        for(MemberDTO member: newMembersDTO){
            System.out.println(member);
        }
    }
}
