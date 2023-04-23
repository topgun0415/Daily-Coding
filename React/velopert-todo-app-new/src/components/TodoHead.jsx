/** @format */
import React, { useState } from 'react';
import styled from 'styled-components';

const TodoHeadBlock = styled.div`
  padding-top: 48px;
  padding-left: 32px;
  padding-right: 32px;
  padding-bottom: 24px;
  border-bottom: 1px solid #e9ecef;

  h1 {
    margin: 0;
    font-size: 36px;
    color: #343a40;
  }

  .day {
    margin-top: 4px;
    color: #868e96;
    font-size: 21px;
  }

  .tasks-left {
    color: #20c997;
    font-size: 18px;
    margin-top: 40px;
    font-weight: bold;
  }
`;

const TodoHead = () => {
  const now = new Date();

  const [date, setDate] = useState(
    `${now.getFullYear()}년 ${now.getMonth()}월 ${now.getDate()}일`
  );

  return (
    <TodoHeadBlock>
      <h1>{date}</h1>
      <div className='day'>일요일</div>
      <div className='tasks-left'>할일 2개 남았음</div>
    </TodoHeadBlock>
  );
};

export default TodoHead;
