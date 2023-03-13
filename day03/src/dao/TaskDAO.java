package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.koreait.mybatis.config.MyBatisConfig;

import vo.TaskVO;
import vo.UserVO;

public class TaskDAO {
	
	private final int KEY = 3;
	
	public Connection connection; //연결 객체
	public PreparedStatement preparedStatement; //쿼리(SQL문) 객체
	public ResultSet resultSet; //결과 테이블 객체
	public SqlSession sqlSession;
	
	public TaskDAO() {
		sqlSession = MyBatisConfig.getSqlsessionFactory().openSession(true);
	}
	
	public boolean checkId(String userId) {
		return (Integer)sqlSession.selectOne("User.checkId", userId) == 1;
	}
	
//	아이디 중복검사
//	public boolean checkId(String id) {
////		USER_ID 컬럼에서 사용자가 입력한 id 검사
//		String query = "SELECT COUNT(USER_ID) FROM TBL_USER WHERE USER_ID = ?";
//		boolean check = false;
//		try {
////			연결 객체 가져오기
//			connection = DBConnecter.getConnection();
////			작성한 쿼리문을 preparedStatement에 전달
//			preparedStatement = connection.prepareStatement(query);
////			? 채우기(좌에서 우로 1부터 1씩 증가)
//			preparedStatement.setString(1, id);
////			쿼리 실행
//			resultSet = preparedStatement.executeQuery();
////			결과 행 1개 가져오기
//			resultSet.next();
////			결과 첫번째 열 1개 가져오기
////			1이라면 사용자가 입력한 아이디가 1개 조회된 것이기 때문에 중복된 아이디이다.
//			check = resultSet.getInt(1) == 1;
//			
//		} catch (SQLException e) {
//			System.out.println("checkId()에서 쿼리문 오류");
//		} finally {
//			try {
////				연결 객체 모두 닫기
//				if(resultSet != null) {
//					resultSet.close();
//				}
//				if(preparedStatement != null) {
//					preparedStatement.close();
//				}
//				if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
//		
//		return check;
//	}
	
	public void insert(TaskVO taskVO) {
		sqlSession.insert("User.insert", taskVO);
	}
	
//	회원가입
//	public void insert(TaskVO taskVO) {
//		String query = "INSERT INTO TBL_USER "
//				+ "(USER_NUMBER, USER_ID, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH_DATE, USER_GENDER, USER_RECOMMENDER_ID, USER_JOB)"
//				+ "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//		
//		try {
//			connection = DBConnecter.getConnection();
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, taskVO.getUserId());
//			preparedStatement.setString(2, taskVO.getUserName());
//			preparedStatement.setString(3, taskVO.getUserPassword());
//			preparedStatement.setString(4, taskVO.getUserPhone());
//			preparedStatement.setString(5, taskVO.getUserNickname());
//			preparedStatement.setString(6, taskVO.getUserEmail());
//			preparedStatement.setString(7, taskVO.getUserAddress());
//			preparedStatement.setString(8, taskVO.getUserBirthDate());
//			preparedStatement.setString(9, taskVO.getUserGender());
//			preparedStatement.setString(10, taskVO.getUserRecommenderId());
//			preparedStatement.setString(11, taskVO.getUserJob());
//			preparedStatement.executeUpdate();
//			
//		} catch (SQLException e) {
//			System.out.println(e);
//			System.out.println("insert()에서 쿼리문 오류");
//			
//		} finally {
//			try {
//				if(preparedStatement != null) {
//					preparedStatement.close();
//				}
//				if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
//	}

	List<TaskVO> users = sqlSession.selectList("User.selectAll");
	public boolean login(TaskVO users) {
		sqlSession.insert("User.selectAll", users);
		return Integer.parseInt(sqlSession.selectOne("User.selectAll", users)) == 1;
	}
	
//	로그인
//	public int login(String userId, String userPassword) {
//		String query = "SELECT USER_NUMBER FROM TBL_USER WHERE USER_ID = ? AND USER_PASSWORD = ?";
//		int userNumber = 0;
//		try {
//			connection = DBConnecter.getConnection();
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, userId);
//			preparedStatement.setString(2, userPassword);
//			resultSet = preparedStatement.executeQuery();
//			
//			if(resultSet.next()) {
//				userNumber = resultSet.getInt("USER_NUMBER");
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("login() 쿼리문 오류");
//		} finally {
//			try {
//				if(resultSet != null) {
//					resultSet.close();
//				}
//				if(preparedStatement != null) {
//					preparedStatement.close();
//				}
//				if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
//		return userNumber;
//	}
//	암호화
//	public String encrypt(String password) {
//		String encryptedPassword = "";
//		for (int i = 0; i < password.length(); i++) {
//			encryptedPassword += (char)(password.charAt(i) * KEY);
//		}
//		return encryptedPassword;
//	}
	
//	회원탈퇴
	public void delete(int userNumber) {
		sqlSession.delete(String.valueOf(userNumber));	
	}
	
//	public void delete(int userNumber) {
//		String query = "DELETE FROM TBL_USER WHERE USER_NUMBER = ?";
//		try {
//			connection = DBConnecter.getConnection();
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setInt(1, userNumber);
//			preparedStatement.executeUpdate();
//			
//		} catch (SQLException e) {
//			System.out.println("delete() 쿼리문 오류");
//			e.printStackTrace();
//		} finally {
//			try {
//				if(preparedStatement != null) {
//					preparedStatement.close();
//				}
//				if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
//	}

	public String findId(String userPhone) {
		sqlSession.selectOne("user_id", userPhone);
		return "user_id";
	}
	
//	아이디 찾기
//	public String findId(String userPhone) {
//		String userId = null;
//		String query = "SELECT USER_ID FROM TBL_USER WHERE USER_PHONE = ?";
//		try {
//			connection = DBConnecter.getConnection();
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setString(1, userPhone);
//			resultSet = preparedStatement.executeQuery();
//			
//			if(resultSet.next()) {
//				userId = resultSet.getString(1);
//			}
//			
//		} catch (SQLException e) {
//			System.out.println("findId() 쿼리문 오류");
//			e.printStackTrace();
//		} finally {
//			try {
//				if(resultSet != null) {
//					resultSet.close();
//				}
//				if(preparedStatement != null) {
//					preparedStatement.close();
//				}
//				if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException(e.getMessage());
//			}
//		}
//		return userId;
//	}
//	
//	비밀번호 변경
	public void updateUserPassword(String userId, String userPassword) {
		String query = "UPDATE TBL_USER SET USER_PASSWORD = ? WHERE USER_ID = ?";
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userPassword);
			preparedStatement.setString(2, userId);
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("updateUserPassword() 쿼리 오류");
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
	
//	회원정보 수정
	public void update(TaskVO taskVO) {
		String query = "UPDATE TBL_USER "
				+ "SET USER_NAME=?, USER_PASSWORD=?, USER_PHONE=?, USER_NICKNAME=?, USER_ADDRESS=?, USER_BIRTH_DATE=?, USER_GENDER=? , USER_RECOMMENDER_ID=?, USER_JOB=?"
				+ "WHERE USER_NUMBER = ?";
		
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, taskVO.getUserName());
			preparedStatement.setString(2, taskVO.getUserPassword());
			preparedStatement.setString(3, taskVO.getUserPhone());
			preparedStatement.setString(4, taskVO.getUserNickname());
			preparedStatement.setString(5, taskVO.getUserAddress());
			preparedStatement.setString(6, taskVO.getUserBirthDate());
			preparedStatement.setString(7, taskVO.getUserGender());
			preparedStatement.setString(8, taskVO.getUserRecommenderId());
			preparedStatement.setString(9, taskVO.getUserJob());
			preparedStatement.setInt(10, taskVO.getUserNumber());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("update() 쿼리 오류");
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
	
//	회원정보 조회
	public TaskVO selectUser(int userNumber) {
		String query = "SELECT USER_NUMBER, USER_ID, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH_DATE, USER_GENDER, USER_RECOMMENDER_ID, USER_JOB FROM TBL_USER "
				+ "WHERE USER_NUMBER = ?";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		int i = 0;
		TaskVO taskVO = new TaskVO();
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, userNumber);
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			taskVO.setUserNumber(resultSet.getInt(++i));
			taskVO.setUserId(resultSet.getString(++i));
			taskVO.setUserName(resultSet.getString(++i));
			taskVO.setUserPassword(resultSet.getString(++i));
			taskVO.setUserPhone(resultSet.getString(++i));
			taskVO.setUserNickname(resultSet.getString(++i));
			taskVO.setUserEmail(resultSet.getString(++i));
			taskVO.setUserAddress(resultSet.getString(++i));
			try {taskVO.setUserBirthDate(sdf.format(sdf.parse(resultSet.getString(++i))));} catch (Exception e) {;}
			taskVO.setUserGender(resultSet.getString(++i));
			taskVO.setUserRecommenderId(resultSet.getString(++i));
			taskVO.setUserJob(resultSet.getString(++i));
			
		} catch (SQLException e) {
			System.out.println("updateUser() 쿼리문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return taskVO;
	}
	
	
//	추천수
	public int getTotalOfRecommender(String userId) {
		String query = "SELECT COUNT(USER_RECOMMENDER_ID) FROM TBL_USER WHERE USER_RECOMMENDER_ID = ?";
		int count = 0;
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				count = resultSet.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return count;
	}
	
//	나를 추천한 사람
	public ArrayList<TaskVO> selectRecommenders(String userId){
		String query = "SELECT USER_NUMBER, USER_ID, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH_DATE, USER_GENDER, USER_RECOMMENDER_ID, USER_JOB FROM TBL_USER "
				+ "WHERE USER_RECOMMENDER_ID = ?";
		ArrayList<TaskVO> recommenders = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		int i = 0;
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				i = 0;
				TaskVO taskVO = new TaskVO();
				taskVO.setUserNumber(resultSet.getInt(++i));
				taskVO.setUserId(resultSet.getString(++i));
				taskVO.setUserName(resultSet.getString(++i));
				taskVO.setUserPassword(resultSet.getString(++i));
				taskVO.setUserPhone(resultSet.getString(++i));
				taskVO.setUserNickname(resultSet.getString(++i));
				taskVO.setUserEmail(resultSet.getString(++i));
				taskVO.setUserAddress(resultSet.getString(++i));
				try {taskVO.setUserBirthDate(sdf.format(sdf.parse(resultSet.getString(++i))));} catch (Exception e) {;}
				taskVO.setUserGender(resultSet.getString(++i));
				taskVO.setUserRecommenderId(resultSet.getString(++i));
				taskVO.setUserJob(resultSet.getString(++i));
				
				recommenders.add(taskVO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return recommenders;
	}
//	내가 추천한 사람
	public TaskVO getMyRecommender(String userId) {
		String query = "SELECT USER_NUMBER, USER_ID, USER_NAME, USER_PASSWORD, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH_DATE, USER_GENDER, USER_RECOMMENDER_ID, USER_JOB " +
				"FROM TBL_USER WHERE USER_ID = " + 
				"(" +
					"SELECT USER_RECOMMENDER_ID FROM TBL_USER " + 
					"WHERE USER_ID = ?" +
				")";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		TaskVO taskVO = new TaskVO();

		int i = 0;
		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				taskVO.setUserNumber(resultSet.getInt(++i));
				taskVO.setUserId(resultSet.getString(++i));
				taskVO.setUserName(resultSet.getString(++i));
				taskVO.setUserPassword(resultSet.getString(++i));
				taskVO.setUserPhone(resultSet.getString(++i));
				taskVO.setUserNickname(resultSet.getString(++i));
				taskVO.setUserEmail(resultSet.getString(++i));
				taskVO.setUserAddress(resultSet.getString(++i));
				try {taskVO.setUserBirthDate(sdf.format(sdf.parse(resultSet.getString(++i))));} catch (Exception e) {;}
				taskVO.setUserGender(resultSet.getString(++i));
				taskVO.setUserRecommenderId(resultSet.getString(++i));
				taskVO.setUserJob(resultSet.getString(++i));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return taskVO;
	}
}



















