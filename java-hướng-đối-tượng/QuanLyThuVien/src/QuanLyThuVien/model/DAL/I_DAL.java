/**
 * Xây dựng truy vấn dựa trên các parameters nhận được từ layer BUS
 * @author IT 1006*/
package QuanLyThuVien.model.DAL;

import java.sql.SQLException;
import java.util.List;

public interface I_DAL<TData> {
	/** Lấy toàn bộ các record của bảng truy�?n vào List_TData */
	List<TData> getAll() throws SQLException, ClassNotFoundException;

	int Add(TData record) throws SQLException, ClassNotFoundException;

	int Delete(Object... code) throws SQLException, ClassNotFoundException;

	int Update(TData record) throws SQLException, ClassNotFoundException;

	/** Chỉ lấy TOP 1 record của bảng truy�?n vào List_TData */
	TData GetOne(Object... code) throws SQLException, ClassNotFoundException;

	int maxCode(String tenBang) throws SQLException, ClassNotFoundException;

}