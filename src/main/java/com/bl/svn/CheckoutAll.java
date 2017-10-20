package com.bl.svn;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;

import org.tmatesoft.svn.core.SVNDirEntry;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.svn.SVNRepositoryFactoryImpl;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.ISVNOptions;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

public class CheckoutAll {

	public static void main(String[] args) {

		// 初始化svn库
		SVNRepositoryFactoryImpl.setup();

		SVNRepository repository;
		try {
			repository = SVNRepositoryFactory.create(SVNURL.parseURIEncoded("svn://192.168.29.100/depot"));

			// 身份验证
			ISVNAuthenticationManager authManager = SVNWCUtil.createDefaultAuthenticationManager("anzhiling",
					"anzhiling3097");
			// 创建身份验证管理器
			repository.setAuthenticationManager(authManager);

			Collection entries = repository.getDir("/dev", -1, null, (Collection) null);

			Iterator iterator = entries.iterator();
			ISVNOptions isvnOptions = SVNWCUtil.createDefaultOptions(true);
			SVNClientManager svnClientManager = SVNClientManager.newInstance(isvnOptions, authManager);
			while (iterator.hasNext()) {
				SVNDirEntry entry = (SVNDirEntry) iterator.next();
				System.out.println("开始checkout"+entry.getName()+"!");
				try {
					svnClientManager.getUpdateClient().doCheckout(
							SVNURL.parseURIEncoded("svn://192.168.29.100/depot/dev/" + entry.getName() + "/trunk"),
							new File("D:\\src\\" + entry.getName().substring(0, 2)), SVNRevision.HEAD, SVNRevision.HEAD,
							true);
				} catch (SVNException e) {
					System.out.println("导出" + entry.getName() + "trunk失败！");
					e.printStackTrace();
				}
			}

		} catch (SVNException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
