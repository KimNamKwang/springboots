package com.example.springboots.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.springboots.beans.BoardBean;

@Service
public class DataInfors {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "남광");
        searchForm.put("id", "ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString;
    }

    public HashMap<String, Object> getBundleData() {

        DataInfors datasInfo = new DataInfors();
        HashMap<String, String> searchForm = datasInfo.getSearchFormData();
        ArrayList<String> tablesListWithString = datasInfo.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        bundlesData.put("dataWithBoardBean", datasInfo.getDataWithBoardBean());
        bundlesData.put("dataListWithBoardBean", datasInfo.getDataListWithBoardBean());

        return bundlesData;
    }
    // <String, String> 자리에 하나는 HaspMap, 하나는 Array를 넣어준다.

    public BoardBean getDataWithBoardBean() {
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");

        return boardBean;
    }

    public ArrayList<BoardBean> getDataListWithBoardBean() {
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");
        membersList.add(boardBean);

        BoardBean boardBean02 = new BoardBean();
        boardBean02.setTitle("Jacob");
        boardBean02.setContent("Thorton");
        boardBean02.setUserName("@fat");
        membersList.add(boardBean02);

        BoardBean boardBean03 = new BoardBean();
        boardBean03.setTitle("Larry");
        boardBean03.setContent("Bird");
        boardBean03.setUserName("@Twitter");
        membersList.add(boardBean03);
        return membersList;
    }

    public BoardBean getDataByUid(String action_uid) {
        ArrayList<BoardBean> memberList = getDataListWithBoardBean();
        BoardBean boardBean = new BoardBean();
        for (BoardBean member : memberList) {
            if (member.getTitle().equals(action_uid)) {
                boardBean.setTitle(member.getTitle());
                boardBean.setContent(member.getContent());
                boardBean.setUserName(member.getUserName());
                boardBean.setDate(member.getDate());
                return boardBean;
            }
            boardBean.setTitle("에러) 없습니다");
            boardBean.setContent("Otto");
            boardBean.setUserName("@mdo");
        }

        return boardBean;
    }

    public BoardBean getDataForBoardBean(String uid) {
        ArrayList<BoardBean> boardBeans = getDataListForBoard();
        BoardBean boardBean = new BoardBean();
        for (int i = 0; i < boardBeans.size(); i++) {
            if (boardBeans.get(i).getUserName().equals(uid)) {
                boardBean = boardBeans.get(i);
            }
        }

        return boardBean;
    }

    public ArrayList<BoardBean> getDataListForBoard() {
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("KAIST, 아시아 유일 팀으로 CES 2023 자율주행차 레이싱 참가");
        boardBean.setContent(
                "KAIST는 1월 5일부터 8일까지 미국 라스베이거스에서 열리는 세계 최대 전자·정보기술 전시회 CES 2023의 공식행사인 `자율주행 레이싱'에 참가한다고 5일 밝혔다. 1월 7일 라스베이거스 모터스피드웨이에서 개최 예정인...");
        boardBean.setUserName("강하나");
        boardBean.setDate("2023.01.01");

        membersList.add(boardBean);

        BoardBean boardBean02 = new BoardBean();
        boardBean02.setTitle("UAM부터 가상발전소까지…SKT, 'CES 2023'서 그린 ICT 알린다");
        boardBean02.setContent(
                "이기범 기자 = SK텔레콤이 5일(현지시간)부터 8일까지 미국 라스베이거스에서 열리는 세계 최대 IT·가전 전시회 'CES 2023'에서 넷제로(탄소중립) 달성을 위한 '그린 ICT' 기술을 선보인다고 5일 밝혔다...");
        boardBean02.setUserName("이기범");
        boardBean02.setDate("2022.11.05");

        membersList.add(boardBean02);

        BoardBean boardBean03 = new BoardBean();
        boardBean03.setTitle("	카카오, 이모티콘 3종 지급…'서비스 장애 사과'");
        boardBean03.setContent("카카오가 지난해 '먹통 사태'에 대한 사과의 의미로 카카오톡 일반 이용자에게 이모티콘 등의 지급을 5일 시작했다...");
        boardBean03.setUserName("임성호");
        boardBean03.setDate("2022.12.15");

        membersList.add(boardBean03);

        BoardBean boardBean04 = new BoardBean();
        boardBean04.setTitle("KT, 전자영수증으로 탄소중립 실천포인트 참여");
        boardBean04.setContent("KT가 탄소중립 실천 문화를 확산하기 위해 한국환경공단에서 시행하는 탄소중립 실천포인트에 참여한다... ");
        boardBean04.setUserName("정예린");
        boardBean04.setDate("2023.01.05");
        membersList.add(boardBean04);
        return membersList;
    }

}
