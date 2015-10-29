package com.bibi.base.utils;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片处理
 * @author 刘宇	E-mail: liuyu_k26@163.com
 * @version 创建时间：2015年10月28日 上午9:48:24
 */
public class ImageUtil {
	/**
	 * 图片水印
	 * 
	 * @param pressImg
	 *            水印图片
	 * @param targetImg
	 *            目标图片
	 * @param x
	 *            修正值 默认在中间
	 * @param y
	 *            修正值 默认在中间
	 * @param alpha
	 *            透明度
	 * @return
	 */
	public static File pressImage(HttpServletRequest request, File img,
			float alpha) {
		try {
			String basePath = request.getContextPath();
			String pressImg = basePath + "/images/shuiyin.png";
			Image src = ImageIO.read(img);
			int wideth = src.getWidth(null);
			int height = src.getHeight(null);
			BufferedImage image = new BufferedImage(wideth, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(src, 0, 0, wideth, height, null);
			// 水印文件
			Image src_biao = resizePNG(new File(pressImg), wideth / 3, false);
			int wideth_biao = src_biao.getWidth(null);
			int height_biao = src_biao.getHeight(null);
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,
					alpha));
			// 调整水印位置
			g.drawImage(src_biao, 10, (height - height_biao - 10), wideth_biao,
					height_biao, null);
			// 水印文件结束
			g.dispose();
			ImageIO.write((BufferedImage) image, "jpg", img);
			return img;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return img;
	}

	/**
	 * 缩放
	 * 
	 * @param filePath
	 *            图片路径
	 * @param width
	 *            宽度
	 * @param bb
	 *            比例不对时是否需要补白
	 */
	public static File resize(File f, double widthk, boolean bb) {
		try {
			double ratio = 0.0; // 缩放比例
			BufferedImage bi = ImageIO.read(f);
			// 按宽度缩放大小
			double imageWidth = bi.getWidth() / widthk;
			if (imageWidth <= 1) {
				return f;
			}

			int height = Integer.parseInt(new java.text.DecimalFormat("0")
					.format(bi.getHeight() / imageWidth));
			int width = Integer.parseInt(new java.text.DecimalFormat("0")
					.format(bi.getWidth() / imageWidth));
			@SuppressWarnings("static-access")
			Image itemp = bi.getScaledInstance(width, height, bi.SCALE_SMOOTH);
			// 计算比例
			if ((bi.getHeight() > height) || (bi.getWidth() > width)) {
				if (bi.getHeight() > bi.getWidth()) {
					ratio = (new Integer(height)).doubleValue()
							/ bi.getHeight();
				} else {
					ratio = (new Integer(width)).doubleValue() / bi.getWidth();
				}
				AffineTransformOp op = new AffineTransformOp(
						AffineTransform.getScaleInstance(ratio, ratio), null);
				itemp = op.filter(bi, null);
			}
			if (bb) {
				BufferedImage image = new BufferedImage(width, height,
						BufferedImage.TYPE_INT_RGB);
				Graphics2D g = image.createGraphics();
				g.setColor(Color.white);
				g.fillRect(0, 0, width, height);
				if (width == itemp.getWidth(null))
					g.drawImage(itemp, 0, (height - itemp.getHeight(null)) / 2,
							itemp.getWidth(null), itemp.getHeight(null),
							Color.white, null);
				else
					g.drawImage(itemp, (width - itemp.getWidth(null)) / 2, 0,
							itemp.getWidth(null), itemp.getHeight(null),
							Color.white, null);
				g.dispose();
				itemp = image;
			}
			ImageIO.write((BufferedImage) itemp, "jpg", f);
			return f;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return f;
	}

	/**
	 * 缩放
	 * 
	 * @param filePath
	 *            图片路径
	 * @param width
	 *            宽度
	 * @param bb
	 *            比例不对时是否需要补白
	 * @throws IOException
	 */
	public static Image resizePNG(File f, double widthk, boolean bb)
			throws IOException {
		Image itemp = ImageIO.read(f);
		try {
			double ratio = 0.0; // 缩放比例
			BufferedImage bi = ImageIO.read(f);
			// 按宽度缩放大小
			double imageWidth = bi.getWidth() / widthk;
			int height = Integer.parseInt(new java.text.DecimalFormat("0")
					.format(bi.getHeight() / imageWidth));
			int width = Integer.parseInt(new java.text.DecimalFormat("0")
					.format(bi.getWidth() / imageWidth));
			// Image itemp = bi.getScaledInstance(width, height,
			// bi.SCALE_SMOOTH);
			// 计算比例
			if ((bi.getHeight() > height) || (bi.getWidth() > width)) {
				if (bi.getHeight() > bi.getWidth()) {
					ratio = (new Integer(height)).doubleValue()
							/ bi.getHeight();
				} else {
					ratio = (new Integer(width)).doubleValue() / bi.getWidth();
				}
				AffineTransformOp op = new AffineTransformOp(
						AffineTransform.getScaleInstance(ratio, ratio), null);
				itemp = op.filter(bi, null);
			}
			// ImageIO.write((BufferedImage)itemp, "PNG", file);
			// ImageIO.write(((sun.awt.image.ToolkitImage)itemp).getBufferedImage(),
			// "png", f);
			return itemp;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return itemp;
	}
}
